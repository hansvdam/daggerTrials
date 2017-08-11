package com.example;

public class ImportantClass {
    private MyRestService restService;
    private MyLogger logger;

    @Inject public MainService(MyRestService restService, MyLogger logger) {
        this.restService = restService;
        this.logger = logger;
    }

    public void perform() {
        String s = restService.getData();
        logger.write(s.toUpperCase());
    }
}