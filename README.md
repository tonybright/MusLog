# MusLog
A lightweight and scalable log tool for Android Developer 


this library has been uploaded to jCenter, add following statement below to your build.gradle:   
compile '**com.tonybright.utils:muslog:1.0.0**' 

Best Practice for MusLog is as follows:  

1. add following code in your XXApplication.OnCreate(): 
    **MusLog.init("Your customized MainTag", BuildConfig.DEBUG)** 

2. if you wanna use ClassName as the subTag, try these:  
    **MusLog.v**("hello buddy");   
    **MusLog.v**("hello buddy, today is %s", new Date());  
as you see, variable parameters are well supported in MusLog, the advantage is less performance cost 
when you disable the MusLog in your app's release version.  

3. if you wanna customized subTag, try these:  
    **MusLog.vTag**("SubTag", "hello buddy");  
    **MusLog.vTag**("SubTag", "hello buddy, today is %s", new Date());  

    And, of course, verbose/debug/info/warning/error log levels are supported in MusLog,  
they are corresponding to MusLog.v/d/i/w/e or MusLog.vTag/dTag/iTag/wTag/eTag respectively.
