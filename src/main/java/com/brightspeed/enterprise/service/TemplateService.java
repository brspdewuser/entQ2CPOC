package com.brightspeed.enterprise.service;


import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;



import java.util.Map;

@Service
public class TemplateService {

    @Autowired
    SpringTemplateEngine templateEngine;

    private String parseThymeleafTemplate() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("to", "VOIP Customer");

        return templateEngine.process("VOIPContractTemplate", context);
    }

    public void generatePdfFromHtml(String html) {




    }

    private String getHtmlString(Map<String, Object> variables, String templatePath) {
        try {
            final Context ctx = new Context();
            ctx.setVariables(variables);
            return templateEngine.process(templatePath, ctx);
        } catch (Exception e) {
            return null;
        }


    }
}

