set PROJ_HOME=F:\Kulesh\TestNG
set CHROME_DRIVER=F:\WorkSpace\Sellinium\chromedriver.exe

cd /d %PROJ_HOME%\lib
START java -jar selenium-server-standalone-2.39.0.jar -role hub
SLEEP 10
START java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=chrome,platform=WINDOWS -port 5556 -Dwebdriver.chrome.driver=%CHROME_DRIVER%
SLEEP 10
START java -jar selenium-server-standalone-2.39.0.jar -role webdriver -hub http://localhost:4444/grid/register -browser browserName=firefox,platform=WINDOWS
@echo on 
cd /d %PROJ_HOME% 
call ant clean
SLEEP 5
call ant compile
SLEEP 5
call ant sendMail
