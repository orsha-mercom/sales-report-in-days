import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

@ManagedBean
@SessionScoped
public class Login implements Serializable {
    private int defaultShopCount;
    private ArrayList<String> shopItem;
    private ResourceBundle bundle;

    private ResourceBundle getBundle() {
        if (bundle == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            bundle = context.getApplication().getResourceBundle(context, "shps");
        }
        return bundle;
    }

    private void fillShopItem() {
        int countShop = Integer.parseInt(getBundle().getString("countShop"));
        shopItem = new ArrayList<String>();
        for (int i = 0; i < countShop; i++) {
            shopItem.add(getBundle().getString("name" + i));
        }
    }

    public Login() {
        fillShopItem();
    }

    public String getDefaultShop() {
        //return shopItem.get(defaultShopCount);
        return "defValue";
    }

    public ArrayList<String> getShopItemsValue() {
//        shopItem = new ArrayList<String>(2);
//        shopItem.add(0, "one");
//        shopItem.add(1, "two");
        return shopItem;
    }

    public String test() {
        return "repCondition";
    }
}
