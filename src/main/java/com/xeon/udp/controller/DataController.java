package com.xeon.udp.controller;

import com.xeon.udp.model.DataRequest;
import com.xeon.udp.model.DataResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class DataController {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public DataResponse showStatus() {
        return new DataResponse(SUCCESS_STATUS, 1);
    }

    @PostMapping("/pay")
    public DataResponse sendData(@RequestParam(value = "key") String key, @RequestBody DataRequest request) {

        final DataResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            String userId = request.getUserId();
            String discount = request.getData();
            // Process the request
            // ....
            // Return success response to the client.
            response = new DataResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new DataResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }
}