GATLING:
Powerful open-source Performance Test tool released in December, 2011. Gatling is a lightweight DSL written in Scala that comes with the interesting premise of "treating your performance tests as production code".

Steps for setting up Mac
1. Install Homebrew

Run this command on the terminal:

/usr/bin/ruby -e “$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)”

2. Install Java and

Now that you have homebrew,you can get JDK using Homebrew cask.

$ brew cask install java

3. Install gradle

We have installed using homebrew

$ brew install gradle

4. Install the IDE (optional)

We have used community edition of Intellij from https://www.jetbrains.com/idea/

5. Add Scala plugin to IDE

On Startup IntelliJ gives an option to add Scala plugin. You can check it and install on launching IntelliJ for the first time. Otherwise, as soon as you add “apply plugin: “scala” in your build.gradle, IntelliJ prompts you to download scala plugin.

Steps for setting up Windows
1. Install Java(JRE & JDK)

2. Install gradle

3. Install the IDE(or any other IDE – optional)

We have used community edition of Intellij from https://www.jetbrains.com/idea/

4. Add Scala plugin to IDE

On Startup IntelliJ gives an option to add Scala plugin. You can check it and install on launching IntelliJ for the first time. Otherwise, as soon as you add “apply plugin: “scala” in your build.gradle, IntelliJ prompts you to download scala plugin.

GATLING RECORDER:

Step 1 : Configure Browser
Change the proxy settings, give address as 'localhost' and port as say - 8080

Step 2 : Recording the Scenario
For mac: naviagte to the bin folder of Gatling in terminal and run
$sh recorder.sh

For Windows: Go to the bin folder of Gatling bundle and open the "recorder.bat" file

>Enter the port number in localhost box - 8080
>Enter the package and class name
>Check “Follow Redirects”, “Infer HTML resources”, “Remove Cache Headers” and “Automatic Referrers” options
>Click on Start button

>Record the scenario you want to test
>Close the browser
>Click on “Stop & save” button and Gatling recorder window is closed

Note: for more info on the options on recorder, please refer http://gatling.io/docs/current/http/recorder/

Step 3 : Executing load testing using Gatling
For mac: naviagte to the bin folder of Gatling in terminal and run
$sh gatling.sh

For Windows: Go to the bin folder of Gatling bundle and open the "gatling.bat" file

>Select the file to be executed, enter the simulation number and enter the simulation description (optional)

Step 4 : Viewing results
Results would be generated in HMRL format on running the simulation file as mentioned in Step 3. Open the html file in any browser to view the same.

Note: For more on understanding the results, refer : http://gatling.io/docs/current/general/reports/

Gatling structure can be defined in 4 different parts:

1) HTTP protocol configuration – This will define your base URL that you will be running your tests against. Also, you can define some other configurations such as user agent, language header, connection and so on.
2) Headers definition – This provides the headers for each request that will be sent to the server. This is relevant because the headers also add a bit of load to the server you are testing.
3) Scenario definition - The core of your test! A Scenario is a group of actions (GET, POST, etc.) that will be executed in order to simulate a user interaction with your application.
4) Simulation definition - This defines the load (amount of users) that will concurrently execute your scenario for a period of time.
