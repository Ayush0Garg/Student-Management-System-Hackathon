package com.example.Student.Management.System.Models;


public class Response {
    private String id;
    private String response;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Response(String response, String id) {
        this.response = response;
        this.id = id;
    }
}
