# Keep Room

-keep class androidx.room.** { *; }

# Keep Hilt

-keep class dagger.hilt.** { *; }

# Keep Gson

-keep class com.google.gson.** { *; }

# Keep Kotlin Metadata

-keep class kotlin.Metadata { *; }

# Remove Logs

-assumenosideeffects class android.util.Log {

    public static *** d(...);

    public static *** i(...);

    public static *** v(...);

}
