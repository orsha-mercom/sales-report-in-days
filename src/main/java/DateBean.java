import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

@ManagedBean
public class DateBean implements Serializable{
    private Date dateFirst;
    private Date dateEnd;
    private ResourceBundle bundle;

    private ResourceBundle getBundle() {
        if (bundle == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            bundle = context.getApplication().getResourceBundle(context, "default");
        }
        return bundle;
    }
    public DateBean() {
        dateEnd = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, Integer.parseInt(getBundle().getString("firstDateBefore")));
        dateFirst = calendar.getTime();
    }

    public Date getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(Date dateFirst) {
        this.dateFirst = dateFirst;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}