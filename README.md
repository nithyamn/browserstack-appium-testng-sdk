# browserstack-appium-testng-sdk

## Steps to run tests

### Android
* Set the BrowserStack credentials in `browserstack-android.yml` or set it as an environment variable
* - For \*nix based and Mac machines:
```sh
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
```
- For Windows:
```shell
  set BROWSERSTACK_USERNAME=<browserstack-username>
  set BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
```
* Change app path in `browserstack-android.yml` file
* Command to execute: `mvn test -Dtest=AndroidTestCase -Dbrowserstack.config=browserstack-android.yml`

### iOS
* Set the BrowserStack credentials in `browserstack-ios.yml` or set it as an environment variable
* - For \*nix based and Mac machines:
```sh
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
```
- For Windows:
```shell
  set BROWSERSTACK_USERNAME=<browserstack-username>
  set BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
```
* Change app path in `browserstack-ios.yml` file
* Command to execute: `mvn test -Dtest=IOSTestCase -Dbrowserstack.config=browserstack-ios.yml`

