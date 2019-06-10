package com.hyphenate.liveroom;

import android.graphics.Color;

public class Constant {
    public static final String EXTRA_OWNER_NAME = "ownerName";
    public static final String EXTRA_ROOM_NAME = "roomName";
    public static final String EXTRA_PASSWORD = "password";

    public static final String EXTRA_ROOM_ADMIN = "roomAdmin";
    public static final String EXTRA_ROOM_PWD = "roomPwd";

    public static final String DOWNLOAD_APPLINK = "http://m.easemob.com/download/app/tcdemo";

    public static final String EXTRA_CHAT_TYPE = "chatType";
    public static final String EXTRA_CHATROOM_ID = "chatroomId";
    public static final String EXTRA_CONFERENCE_ID = "conferenceId";
    public static final String EXTRA_ALLOW_REQUEST = "allowRequest";
    public static final String EXTRA_CHAT_ROOM = "chatRoomEntity";
    public static final String EXTRA_ROOM_TYPE = "roomType";

    public static final int CHATTYPE_SINGLE = 1;
    public static final int CHATTYPE_GROUP = 2;
    public static final int CHATTYPE_CHATROOM = 3;

    public static final String EM_CONFERENCE_ID = "em_conference_id";
    public static final String EM_CONFERENCE_OP = "em_conference_op";
    public static final String OP_REQUEST_TOBE_SPEAKER = "request_tobe_speaker";
    public static final String OP_REQUEST_TOBE_AUDIENCE = "request_tobe_audience";
    public static final String OP_REQUEST_BE_REJECTED = "request_tobe_rejected";

    // 互动模式
    public static final String ROOM_TYPE_COMMUNICATION = "communication";
    // 主持模式
    public static final String ROOM_TYPE_HOST = "host";
    // 抢麦模式
    public static final String ROOM_TYPE_MONOPOLY = "monopoly";

    public static final String MESSAGE_GIFT = "send a gift.";
    public static final String MESSAGE_FAVOURITE = "like +1.";

    public static final int COLOR_WHITE = Color.parseColor("#FFFFFF");
    public static final int COLOR_BLACK = Color.parseColor("#000000");

    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_TALKER = "talker";
    public static final String PROPERTY_MUSIC = "music";

    public static final int ERROR_MIC_OCCUPY_FAILED = 1000;

    public static final int SECONDS_MIC_OCCUPIED = 30;




}
