# Lending Flutter Sample

Sample project that helps with the integration of Lending plugin.


## Add Plugin

Specify the following in `local.properties` file:

- ACCESS_KEY=<access_key>
- SECRET_KEY=<secret_key>
- LENDING_SDK_VERSION=<lending_sdk_version>
- DC_SDK_VERSION=<dc_sdk_version>
- COMMON_SDK_VERSION=<common_sdk_version>
- COMMON_FLAVOR=<common_flavor>
- LOGGER_SDK_VERSION=<logger_sdk_version>

Add plugin dependency in `pubspec.yaml` file:

 ```yaml
 finbox_lending_plugin: any
 ```

## Init Library in Kotlin Application

```kotlin
class MainApp:FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
        FinBoxLendingPlugin.initLibrary(this)
    }
}
```

## Init SDK

```dart
 FinBoxLendingPlugin.initSdk(
"Environment",
"Api key",
"Customer ID",
"Customer token",
"Credit Line withdrawl amount");
```


## Handle SDK Journey Result

Set method handler inside `build` method of your home page

```dart
FinBoxLendingPlugin.platform.setMethodCallHandler(_getJourneyResult);
```

Create a method in dart file to handle this callback.


```dart
static Future<void> _getJourneyResult(MethodCall call) async {
if (call.method == 'getJourneyResult')
{var json=call.arguments}
}
```
Following json will be received
```json
{"code":"code","screen":"screen","message":"message"}
```

## Error Codes

Below table contains the error codes and the description:

error_type | Description |
--- | --- | 
MU002 | Trial Expired for Dev Credentials
MU003 | PDF Password Incorrect
MU004 | Specified bank doesn't match with detected bank
MU006 | Non Parsable PDF - PDF file is corrupted or has no selectable text (only scanned images)
MU020 | Not a valid statement or bank is not supported
MU021 | Invalid Date Range
NB000 | NetBanking Failed
NB003 | Netbanking Login Error
NB004 | Captcha Error
NB005 | Security Error
