package wugk.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WUGUOKAI on 2017/11/20.
 */
public class Icons {
    Map<String , IconModel> iconModels = new HashMap<String, IconModel>();
}

class IconModel{
    String action;
    Integer bundleId;
    String iconName;
    String md5Code;
}

