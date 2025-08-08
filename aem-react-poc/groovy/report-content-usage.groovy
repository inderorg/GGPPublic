import com.day.cq.wcm.api.Page
import com.day.cq.wcm.api.PageManager

def pageManager = resourceResolver.adaptTo(PageManager)
def rootPage = pageManager.getPage("/content/aem-react-poc/us/en")
def report = new StringBuilder()

report.append("content Usage Report - ${new Date()}\n")
report.append("=====\n")

rootPage.listChildren().each{
    page -> report.append("Page: ${page.path}, Title: ${page.title}, Last Modified: ${page.lastModified}\n")
}

def file = new File("content-usage-report.txt")
file.text = report.toString()

