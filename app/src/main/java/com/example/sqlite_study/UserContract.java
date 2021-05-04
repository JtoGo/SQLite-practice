package com.example.sqlite_study;

import android.provider.BaseColumns;

// インスタンス化させないようにする！
public final class UserContract {
    public UserContract() {}

    // Tips: final とは可変性を持たない変数．staticとはクラスに固有の値
    public static abstract class Users implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COL_NAME = "name";
        public static final String COL_SCORE = "score";
    }
}
