package com.example.aemreactpoc.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class PageModel {
    @inject
    private String title;

    @inject
    private String content;

    public String getTitle() {
        return title != null ? title : "Default Title";
    }
    public String getContent() {
        return content != null ? content : "Default Content "
    }
}