package com.study.providerticket.controller;

import com.study.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xianlehuang
 * @Description:
 * @date: ${date} ${time}
 */

    @RestController
    public class TicketController {
        @Autowired
        TicketService ticketService;

        @RequestMapping("/ticket")
        public String getTicket(){
            return ticketService.getTicket();
        }
    }
