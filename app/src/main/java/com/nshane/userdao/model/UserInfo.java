package com.nshane.userdao.model;

import android.text.TextUtils;

import com.nshane.userdao.UserDaoApplication;
import com.nshane.userdao.utils.SharePreferenceManager;

import org.json.JSONObject;

/**
 * Created by lbl on 2017-10-25.
 */

public class UserInfo {
    public String uid;
    public String name;

    public int coinNum;
    public int likedNum;
    public int followedNum;
    public int bottleNum;

    //update for circle version
    public int costCoinNum;
    public long createTime;
    public long loginTime;
    public String deviceId; // I for caps at per'se
    public String email;
    public String regIP;
    public int stateNum;

    public int id;


    public int isFollowed;// 1 if followed,0
    public String icon;

    public String token;

    public String country;
    public String sex;


    public String uidNum;
    public String sdkuid;
    public String iconHD;

    public String profession;

    public String slogan;

    public UserInfo() {
    }

    public UserInfo(JSONObject obj) {
        if (obj == null) {
            return;
        }
        uid = obj.optString("uid");
        token = obj.optString("token");
        name = obj.optString("name");
        icon = obj.optString("icon");
        sex = obj.optString("sex");
        country = obj.optString("country");
        coinNum = obj.optInt("coinNum");
        likedNum = obj.optInt("likedNum");
        followedNum = obj.optInt("followedNum");
        bottleNum = obj.optInt("bottleNum");
        uidNum = obj.optString("uid3");
        sdkuid = obj.optString("sdkuid");
        isFollowed = obj.optInt("isfollowed");
        iconHD = obj.optString("icon_o");
        uid = obj.optString("uid");
        name = obj.optString("name");
        profession = obj.optString("job");
        slogan = obj.optString("signature");
    }

    public static String getUserId() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_UID.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_UID.defaultValue);
    }

    public static String getUserName() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_NAME.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_NAME.defaultValue);
    }

    public static String getUserIcon() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_ICON.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_ICON.defaultValue);
    }

    public static String getUid3() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_UID3.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_ICON.defaultValue);
    }

    public static boolean isVisistor() {
        return TextUtils.isEmpty(SharePreferenceManager.getString(UserDaoApplication.getInstance()
                , SharePreferenceManager.FBInfoXml.XML_NAME
                , SharePreferenceManager.FBInfoXml.KEY_UID3.key
                , SharePreferenceManager.FBInfoXml.KEY_UID3.defaultValue));

    }


    public static String getUserProfession() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_PROFESSION.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_PROFESSION.defaultValue);
    }


    public static String getUserSlogan() {
        return SharePreferenceManager.getString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_SLOGAN.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_SLOGAN.defaultValue);
    }

    public static int getUserCoins() {
        return SharePreferenceManager.getInt(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_GOLD_NUM.key, SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_GOLD_NUM.defaultValue);
    }

    public static void setUserName(String str) {
        SharePreferenceManager.setString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_NAME.key, str);
    }

    public static void setUserProfession(String str) {
        SharePreferenceManager.setString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_PROFESSION.key, str);
    }

    public static void setUserSlogan(String str) {
        SharePreferenceManager.setString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_SLOGAN.key, str);
    }

    public static void setUserIcon(String str) {
        SharePreferenceManager.setString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_ICON.key, str);
    }

    public static void setUserGender(String str) {
        SharePreferenceManager.setString(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_SEX.key, str);
    }

    public static void setUserCoins(int coins) {
        SharePreferenceManager.setInt(UserDaoApplication.getInstance(), SharePreferenceManager.FBInfoXml.XML_NAME,
                SharePreferenceManager.FBInfoXml.KEY_FACEBOOK_GOLD_NUM.key, coins);
    }


}
