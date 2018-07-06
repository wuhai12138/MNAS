package com.summ.mnas.controller.customer;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author summ
 * @since 2018-05-14
 */
@Api(tags = "验证码模块")
@RestController

@RequestMapping(value = "/jSystemAuthCode",method = RequestMethod.POST)
public class SystemAuthCodeController {

}

