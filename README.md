# LogToFile
Android一个简单实用把Log日志打印到手机本地文件开源代码

把日志写入到文件的工具类，优先顺序 SD卡->外部存储->内部存储，三者按顺序自动选择

使用方法：

1：初始化 FileLogUtils.init(Context);

2：使用 FileLogUtils.write(你的Log信息);

日志文件路径：

若存在SD卡或者外部存储，则在 SD\Android\data\包名\files\Log\logs.txt

若不存在SD卡或者外部存储，则在 \data\data\包名\files\Log\logs.txt

在使用此方前要记得先初始化

LogToFileUtils.init(mContexet);
然后调.write方法写手机本地文件

举个例子
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