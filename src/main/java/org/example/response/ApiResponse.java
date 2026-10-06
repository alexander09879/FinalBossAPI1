package org.example.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApiResponse <T> {

    private boolean succsess;
    private String message;
    private T data;

    public ApiResponse(boolean succsess, String message, T data) {
        this.succsess = succsess;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(boolean succsess, String message) {
        this.succsess = succsess;
        this.message = message;
    }
}
