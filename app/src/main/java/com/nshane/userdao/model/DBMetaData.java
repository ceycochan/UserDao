package com.nshane.userdao.model;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by lbl on 2017-10-25.
 */

public class DBMetaData {
    public static final String AUTHORITY = "com.memo.launcher.provider.WatchContentProvider";
    public static final String AUTHORITY_1 = "com.memo.launcher.provider.FavoriteContentProvider";
    public static final String AUTHORITY_2 = "com.memo.launcher.provider.HistoryContentProvider";
    public static final String DATABASE_NAME = "memolauncher.db";
    public static final int DATABASE_VERSION = 4;

    /**
     * 数据库中表相关的元数据
     */
    public static final class WatchTableMetaData implements BaseColumns {

        public static final String TABLE_NAME = "watch";
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/watch");
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.memo.watch";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.memo.watch";

        public static final String WATCH_TITLE = "title";
        public static final String WATCH_SOURCE = "source";
        public static final String WATCH_AUTHOR = "author";
        public static final String WATCH_COUNT = "count";
        public static final String WATCH_URL = "url";
        public static final String WATCH_EYE = "eye";
        public static final String CREATE_DATE = "create_date";

        public static final String DEFAULT_ORDERBY = " create_date DESC";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + WATCH_TITLE + " VARCHAR(50),"
                + WATCH_SOURCE + " VARCHAR(50),"
                + WATCH_AUTHOR + " VARCHAR(50),"
                + WATCH_COUNT + " VARCHAR(50),"
                + WATCH_URL + " VARCHAR(50),"
                + WATCH_EYE + " VARCHAR(50),"
                + CREATE_DATE + " INTEGER"
                + ");";
    }

    /**
     * 数据库中表相关的元数据
     */
    public static final class SearchWordTableMetaData implements BaseColumns {

        public static final String TABLE_NAME = "searchword";

        public static final String SEARCH_WORD = "word";
        public static final String SEARCH_IDENTITY = "identity";
        public static final String SEARCH_NAME = "name";
        public static final String SEARCH_DESCRIPTION = "description";
        public static final String SEARCH_UPLOADER = "uploader";
        public static final String SEARCH_SOURCESITE = "sourceSite";
        public static final String SEARCH_TIMELONG = "timeLong";
        public static final String SEARCH_VIEWTIMES = "viewTimes";
        public static final String SEARCH_PICURL = "picUrl";
        public static final String SEARCH_VIDEOURL = "videoUrl";
        public static final String SEARCH_ALBUMIDENTITY = "albumIdentity";
        public static final String CREATE_DATE = "create_date";

        public static final String DEFAULT_ORDERBY = "create_date DESC";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + SEARCH_WORD + " VARCHAR(50),"
                + SEARCH_IDENTITY + " VARCHAR(50),"
                + SEARCH_NAME + " VARCHAR(50),"
                + SEARCH_DESCRIPTION + " VARCHAR(50),"
                + SEARCH_UPLOADER + " VARCHAR(50),"
                + SEARCH_SOURCESITE + " VARCHAR(50),"
                + SEARCH_TIMELONG + " VARCHAR(50),"
                + SEARCH_VIEWTIMES + " VARCHAR(50),"
                + SEARCH_PICURL + " VARCHAR(50),"
                + SEARCH_VIDEOURL + " VARCHAR(50),"
                + SEARCH_ALBUMIDENTITY + " VARCHAR(50),"
                + CREATE_DATE + " INTEGER"
                + ");";

    }

    public static final class FavoriteTableMetaData implements BaseColumns {
        public static final String TABLE_NAME = "favorite";
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY_1 + "/favorite");
        //MIME Type Config
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.memo.favorite";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.memo.favorite";
        // Player_API content
        public static final String FAVORITE_NAME = "name"; //1
        public static final String FAVORITE_VIDEOURL = "videourl"; //2
        public static final String FAVORITE_IDENTITY = "identity";
        public static final String FAVORITE_ALBUMIDENTITY = "albumIdentity";
        public static final String FAVORITE_CHANNELIDENTITY = "channelIdentity";
        public static final String FAVORITE_CATEGORYIDENTITY = "categoryidentity";
        //display_item
        public static final String FAVORITE_PIC = "picurl"; //3
        public static final String FAVORITE_UPLOADER = "uploader"; //4
        public static final String FAVORITE_COUNT = "count"; //5
        public static final String FAVORITE_SOURCE = "source";

        public static final String CREATE_DATE = "create_date";
        public static final String DEFAULT_ORDERBY = " create_date DESC";
        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + FAVORITE_NAME + " VARCHAR(50),"
                + FAVORITE_VIDEOURL + " VARCHAR(50),"
                + FAVORITE_IDENTITY + " VARCHAR(50),"
                + FAVORITE_ALBUMIDENTITY + " VARCHAR(50),"
                + FAVORITE_CHANNELIDENTITY + " VARCHAR(50),"
                + FAVORITE_CATEGORYIDENTITY + " VARCHAR(50),"
                + FAVORITE_PIC + " VARCHAR(50),"
                + FAVORITE_UPLOADER + " VARCHAR(50),"
                + FAVORITE_COUNT + " VARCHAR(50),"
                + FAVORITE_SOURCE + " VARCHAR(50),"
                + CREATE_DATE + " INTEGER"
                + ");";
    }


    public static final class HistoryTableMetaData implements BaseColumns {
        public static final String TABLE_NAME = "history";
        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY_2 + "/history");

        //MIME Type Config
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.memo.history";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.memo.history";
        // Player_API conten
        public static final String HISTORY_NAME = "name";
        public static final String HISTORY_VIDEOURL = "videourl";
        public static final String HISTORY_IDENTITY = "identity";
        public static final String HISTORY_ALBUMIDENTITY = "albumIdentity";
        public static final String HISTORY_CHANNELIDENTITY = "channelIdentity";
        public static final String HISTORY_CATEGORYIDENTITY = "categoryidentity";
        /**
         * display_item
         */
        public static final String HISTORY_PIC = "picurl";
        public static final String HISTORY_UPLOADER = "uploader";
        public static final String HISTORY_COUNT = "count";
        public static final String HISTORY_SOURCE = "source";

        public static final String CREATE_DATE = "create_date";

        public static final String DEFAULT_ORDERBY = " create_date DESC";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + _ID + " INTEGER PRIMARY KEY,"
                + HISTORY_NAME + " VARCHAR(50),"
                + HISTORY_VIDEOURL + " VARCHAR(50),"
                + HISTORY_IDENTITY + " VARCHAR(50),"
                + HISTORY_ALBUMIDENTITY + " VARCHAR(50),"
                + HISTORY_CHANNELIDENTITY + " VARCHAR(50),"
                + HISTORY_CATEGORYIDENTITY + " VARCHAR(50),"
                + HISTORY_PIC + " VARCHAR(50),"
                + HISTORY_UPLOADER + " VARCHAR(50),"
                + HISTORY_COUNT + " VARCHAR(50),"
                + HISTORY_SOURCE + " VARCHAR(50),"
                + CREATE_DATE + " INTEGER"
                + ");";
    }
}
