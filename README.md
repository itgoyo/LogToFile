# LogToFile
### ↓支持一下
[![GitHub stars](https://img.shields.io/github/stars/itgoyo/LogToFile.svg?style=social&label=Star)](https://github.com/itgoyo/LogToFile) [![GitHub forks](https://img.shields.io/github/forks/itgoyo/LogToFile.svg?style=social&label=Fork)](https://github.com/itgoyo/LogToFile/fork) [![GitHub watchers](https://img.shields.io/github/watchers/itgoyo/LogToFile.svg?style=social&label=Watch)](https://github.com/itgoyo/LogToFile) [![GitHub followers](https://img.shields.io/github/followers/itgoyo.svg?style=social&label=Follow)](https://github.com/itgoyo/LogToFile)  

Android a simple and practical to print to local phone logs Log files open source

The log file is written to the tools, the priority SD card -> external memory -> internal storage, in order to automatically select the three

Instructions:


1: Initialization FileLogUtils.init (Context);

2: Use FileLogUtils.write (your Log information);

Log File Path:

If the SD card or external memory exists, the SD \ Android \ data \ package name \ files \ Log \ logs.txt

If there is an SD card or external memory, then \ data \ data \ package name \ files \ Log \ logs.txt

Before using this square to remember to initialize

```
FileLogUtils.init (mContexet); 
```
then
```
FileLogUtils.write("yourlog");

```
-------

Android一个简单实用把Log日志打印到手机本地文件开源代码

把日志写入到文件的工具类，优先顺序 SD卡->外部存储->内部存储，三者按顺序自动选择

使用方法：

- 方法一

1：初始化 FileLogUtils.init(Context);

2：使用 FileLogUtils.write(你的Log信息);

日志文件路径：

若存在SD卡或者外部存储，则在 SD\Android\data\包名\files\Log\logs.txt

若不存在SD卡或者外部存储，则在 \data\data\包名\files\Log\logs.txt

在使用此方前要记得先初始化

LogToFileUtils.init(mContexet);//最好是在项目的Application配置这样子就不用每次都再设置一次了

然后调.write方法写手机本地文件


### 举个例子
```java

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogToFileUtils.init(this); //初始化

        LogToFileUtils.write("sample text");//写入日志
    }
}

```

- 方法二

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency

```java
dependencies {
	        compile 'com.github.itgoyo:LogToFile:v1.0'
	}
  ```
### LICENSE

源代码在 GPL v3 协议下发布, 使用前, 请确保你了解这个协议!   
如有特殊协议方面的请求, 可以与我沟通: itgoyo@gmail.com

=======

    GNU General Public Licence (GPL)  
    GPL 保证了所有开发者的权利， 
    同时为使用者提供了足够的复制，分发，修改的权利： 
    
    可自由复制  
    你可以将软件复制到你的电脑，你客户的电脑，或者任何地方。复制份数没有任何限制。

    可自由分发  
    在你的网站提供下载，拷贝到U盘送人，或者将源代码打印出来从窗户扔出去（环保起见，请别这样做）。

    可以用来盈利
    你可以在分发软件的时候收费，但你必须在收费前向你的客户提供该软件的 GNU GPL  
    许可协议，以便让他们知道，他们可以从别的渠道免费得到这份软件，以及你收费的理由。  

    
    可自由修改  
    如果你想添加或删除某个功能，没问题，如果你想在别的项目中使用部分代码，  
    也没问题，唯一的要求是，使用了这段代码的项目也必须使用 GPL 协议。  
      
    需要注意的是，分发的时候，需要明确提供源代码和二进制文件，  
    另外，用于某些程序的某些协议有一些问题和限制，  
    你可以看一下 @PierreJoye 写的 Practical Guide to GPL Compliance 一文。  
      
    使用 GPL 协议，你必须在源代码代码中包含相应信息，以及协议本身。  

