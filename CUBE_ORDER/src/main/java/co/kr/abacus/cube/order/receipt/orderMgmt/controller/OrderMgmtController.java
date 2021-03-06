package co.kr.abacus.cube.order.receipt.orderMgmt.controller;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import co.kr.abacus.cube.order.common.utils.ControlFieldSetting;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.dto.OrderResponseDTO;
import co.kr.abacus.cube.order.receipt.orderMgmt.entity.OrderEntity;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtFindService;
import co.kr.abacus.cube.order.receipt.orderMgmt.service.OrderMgmtService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class OrderMgmtController {

  @Autowired
  private OrderMgmtService orderMgmtService;

  @Autowired
  private OrderMgmtFindService orderMgmtFindService;

  @Autowired
  private ControlFieldSetting header;

  @Autowired
  private Gson gson;

  @PostMapping(value="/createOrder")
  public void createOrder(HttpServletRequest request,
                          @RequestHeader Map<String, String> headers,
                          @RequestBody  OrderDTO orderDTO) {

    log.debug(orderDTO.toString());

    ControlFieldDTO controlFieldDTO = header.setControllField(headers);
    orderDTO.setRequestObj(gson.toJson(orderDTO));

    log.debug(controlFieldDTO.toString());
    orderMgmtService.createOrder(orderDTO, controlFieldDTO);

  }

  @GetMapping(value="/{orderNumner}")
  public OrderResponseDTO findByOrder(HttpServletRequest request,
                                      @PathVariable long orderNumner) {
    log.debug("orderNumner :: " + orderNumner);
    return orderMgmtService.findById(orderNumner);
  }

  @GetMapping(value="/prodNo/{prodNo}")
  public OrderResponseDTO findByProdNo(HttpServletRequest request,
                                      @PathVariable String prodNo) {
    log.debug("orderNumner :: " + prodNo);
    return orderMgmtService.findByProdNo(prodNo);
  }

  @GetMapping(value="/entrNo/{entrNo}")
  public OrderResponseDTO findByEntrNo(HttpServletRequest request,
                                  @PathVariable String entrNo) {
    log.debug("entrNo :: " + entrNo);
    return orderMgmtFindService.findByEntrNo(entrNo);
  }

}


