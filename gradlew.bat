<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:gravity="center"
    android:focusable="true"
    android:focusableInTouchMode="true"
    >

    <ImageButton
        android:id="@+id/place_autocomplete_search_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="0"
        android:padding="@dimen/place_autocomplete_button_padding"
        android:src="@drawable/places_ic_search"
        android:background="@null"
        android:contentDescription="@string/place_autocomplete_search_hint"
        />

    <EditText
        android:id="@+id/place_autocomplete_search_input"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@null"
        android:textColor="@color/place_autocomplete_search_text"
        android:textColorHint="@color/place_autocomplete_search_hint"
        android:textSize="20dp"
        android:paddingLeft="16dp"
        android:paddingRight="16dp"
        android:singleLine="true"
        android:lines="1"
        android:maxLines="1"
        android:inputType="textNoSuggestions"
        android:hint="@string/place_autocomplete_search_hint"
        android:focusable="false"
        android:focusableInTouchMode="false"
        />

    <ImageButton
        android:id="@+id/place_autocomplete_clear_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="0"
        android:padding="@dimen/place_autocomplete_button_padding"
        android:src="@drawable/places_ic_clear"
        android:background="@null"
        android:contentDescription="@string/place_autocomplete_clear_button"
        />

</LinearLayout>
                                                                                                                                                                                                                                                                                              