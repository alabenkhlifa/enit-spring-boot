package tn.ensit.spring.xml;

public class ControllerBeanXML {

    private ServiceBeanXML languageService;

    public ControllerBeanXML() {}

    public ServiceBeanXML getLanguageService() {
        return languageService;
    }

    public void setLanguageService(ServiceBeanXML languageService) {
        this.languageService = languageService;
    }
}
