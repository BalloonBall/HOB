# 丰收互联

[English](README.md)

实习项目：参考丰收互联APP界面的制作与开发练习。

## 目录

#### 1. 丰收互联APP(Android)界面模仿练习
1. Mockplus功能简介
1. 从App安装包获取图片资源
1. 使用Mockplus制作基础的载入界面
1. 模拟实现登录→开户流程
#### 2. 高保真图制作练习
1. 高保真图的制作流程以及供给不同应用的需求
1. 使用Adobe Illustrator制作路径图标
1. 使用Adobe Photoshop制作复杂的高保真图片
1. 使用Adobe XD整合并制作高保真界面预览
1. 高保真图的导出和一些注意事项
#### 3. 安卓APP前端开发练习
1. 创建项目
1. 透明状态栏&导航栏
1. 过渡动画
1. 使用SlidingPaneLayout和ListView制作导航菜单
1. 使用Animation-List制作逐帧动画
1. 调用外部lib实现广告图片轮播
            
## 丰收互联APP(Android)界面模仿练习

### 1. Mockplus功能简介

Mockplus是一款着重于设计理念表达的轻量原型图设计软件，适合在软件开发的设计阶段使用。Mockplus内置了主流交互界面（包括Web网页、iOS和Android软件等）所需的大部分布局工具和交互逻辑工具，预览模式中素材的保真度略微降低，便于高效率的个人制作和团队交流。

Mockplus中内置了各个平台，各个种类的交互界面模板，用户可以参考模板设计，调用现有交互逻辑，同时内置了200多种交互组件和3000多种预设图标以供使用。

<img src="/Assets/image/screenshot/template.png" width="600" />

能够生成各个界面的交互流程图，便于正式软件开发者参照比对。

<img src="/Assets/image/screenshot/pageflow.png" width="600" />

第一阶段的任务为使用Mockplus制作简单的页面，上手后尝试模仿丰收互联APP制作加载界面。

### 2. 从App安装包获取图片资源

- 下载丰收互联官方客户端App安装包（.apk格式）
- 用解压缩软件（WinZip)解压apk文件，得到以下文件。从文件夹命名方式可以看出安卓项目的文件资源结构。

    <img src="/Assets/image/screenshot/apk_disassemble.png" width="500" />
  
- 打开图片资源所在的/res文件夹，筛选搜索.png格式的文件，即可获得该apk中大部分的图片图标资源。
- 本次Mockplus练习中所用到的图片图标将来自解包所得的资源。

### 3. 使用Mockplus制作基础的载入界面

一个基础的全屏载入界面需要的组件有：
- 屏幕尺寸的图片组件
- 执行“跳过”功能的按钮
- 定时器

交互流程为：

<img src="/Assets/image/screenshot/fc_loading_page.png" width="500" />

实现效果如下（左图为定时器跳转，右图为点击跳过按钮跳转）：

<img src="Assets/image/screenshot/loading_timer.gif" height="300"/> <img src="Assets/image/screenshot/loading_click.gif" height="300"/> 

### 4. 模拟实现登录→开户流程

Mockplus中多个界面的交互主要通过页链接实现。页链接包含了几种基本的动画效果（推入、滑入、淡出等），可以设定所用动画的持续时间。页链接为点击触发，需要载入触发和延时触发的交互需要使用额外的组件。

本次练习制作了载入界面和主页的标签页，其中重点制作了个人信息标签页，并在此基础上制作了注册开户的主要流程。以下为部分页面效果展示，具体交互效果详见[流程展示录像(密码：0000)](https://v.youku.com/v_show/id_XNDMwMjI2ODc0OA)。

<img src="/Assets/image/screenshot/mockplus_demo.png" width="600" />

### 项目第一阶段小结

Mockplus作为概念设计软件是非常优秀的，它具有上手快、制作快、反馈快、体量小等优点，适合在任务细分明确的大项目组中由UX设计师使用，迅速满足用户反馈的需求。然而，Mockplus也存在缺点。导入Mockplus的资源会为了减小内存占用而明显压缩，实际开发中用到的高保真度素材往往需要由UI设计师根据需求另行制作。这对使用瀑布结构项目管理的传统公司几乎没有影响，但对于使用例如快速反馈结构的创新中小型企业，尤其是当UIUX由同一组设计师负责时，Mockplus无法直接导出开发可用素材会成为明显的短板。

## 高保真图制作练习

### 1. 高保真图的制作流程以及供给不同应用的需求

首先要确定的一个概念：高保真图≠最终成品图。

高保真图是在功能板块确定的情况下，由UI设计师绘制的风格统一的图标图片资源。能够实现高保真原型需要达到的效果，但细节（尺寸，颜色等）还未深入细化。由于开发工程的控件素材不一定能完全满足高保真设计的需求，最终成品需要在开发过程中进行调整。

因为本项目是个人项目，UI设计和产品开发由同一人完成，所以在第二阶段的高保真图将被大部分应用到第三阶段，高保真原型也将无限接近成品。

本项目所需的高保真图主要为适配Android手机App的控件图标，为了适配从低（480p）到高（4K）分辨率的手机屏幕，大多数的控件图标将使用Adobe Illustrator绘制，其余复杂图形将使用Adobe Photoshop绘制。

绘制高保真图之前需要确立设计风格。第二阶段的设计要求为“不同于现有丰收互联客户端App的UI风格”，丰收互联客户端App的UI风格总结为：
- 简约
- 平面化
- 使用同类色或邻近色
- 多个标签页

对此，本项目的UI设计采用了如下选择：
- 涂鸦风格
- 使用对比色和互补色
- 单页竖直滚动

配色选择如下：

<img src="/Assets/image/screenshot/color_theme.png" width="600" />

### 2. 使用Adobe Illustrator制作路径图标

在Adobe Illustrator（简称AI）中，矢量图由路径构成，通过修改路径上的锚点可以精确绘制需要的图形，使得现阶段制作的高保真图有机会被直接修改为最终成品素材。

使用AI制作图标流程的例子如下图所示：

<img src="/Assets/image/screenshot/ai_flow.png" width="600" />

矢量图制作完成后，改变图形大小不会影响图片的清晰度。成品的大小可以在导出素材时设置，导出时可以设置批量导出适应各种分辨率屏幕的素材，此时暂不使用此功能。

### 3. 使用Adobe Photoshop制作复杂的高保真图片

Photoshop（简称PS）常被用于复杂高保真图的制作，尤其是占据大块屏幕空间的背景图片。本项目没有使用大面积的背景图片，但在制作关联第三方软件的控件图标时，使用了PS进行制作。

使用PS制作第三方软件图像的流程如下图所示：

<img src="/Assets/image/screenshot/ps_flow.png" width="600" />

图像统一导出为.png格式。

### 4. 使用Adobe XD整合并制作高保真界面预览

Abobe XD是一款UI/UX矢量化原型设计软件，它包含了许多Adobe软件一脉相承的设计工具，内置了基础的原型交互功能，使用插件来扩展更加复杂的交互需求。与Mockplus不同，Adobe XD文件中保留了设计所用的原始素材，且支持直接导出为开发者使用的资源组（适配不同屏幕分辨率的不同尺寸的图片），其自带组件也都是矢量形式，以便导出为各种尺寸。

本项目将利用Adobe XD素材导出功能的优势，在Adobe XD中先进行素材的排版与交互预览，测试之后统一导出，然后进入正式的App开发流程。

利用适合的插件可以大幅度提高原型设计的效率，参考由Google提供的Android官方素材库可以确保设计风格统一，组件适配屏幕，避免进入开发流程后碰到冲突的或难以实现的布局。

<img src="/Assets/image/screenshot/xd_android_sticker.png" width="600" />

Adobe XD采用了故事板结构的工作界面，便于保持各个页面间的风格统一，高保真度的素材组合能够非常接近成品效果。

<img src="/Assets/image/screenshot/xd_storyboard.png" width="600" />

第二阶段的设计内容包括了载入界面，登录界面和主页等页面，在Adobe XD中的预览效果详见[演示录像(密码：0000)](https://v.youku.com/v_show/id_XNDMwMjI2NjcwMA)。

### 5. 高保真图的导出和一些注意事项

Adobe XD支持将工作界面中的元素导出为各种尺寸的图像资源，以Android项目类型为例，可直接将对应尺寸的图像输出至ldpi, mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi各个文件夹里，开发者可在工程中直接调用。

导出时需要注意的有：
- 将需要导出的组件/组件组命名为方便在Android项目中调用的格式，文件名中的特殊字符可能使调用出错。
- mdpi尺寸的图像以画板尺寸为准，否则容易出现Android项目中图片尺寸和分辨率不匹配，达不到高保真原型的效果。
- 很多组件外观可以通过Android项目自带素材实现，导出前务必确认导出素材的必要性。

### 项目第二阶段小结

第二阶段的高保真原型制作并没有完全模仿丰收互联App的制作流程，主要原因是因为在个人项目中，制作图形素材耗费时间过多，遵循低保真——高保真——成品的流程制作2至3版素材容易导致项目延期。相对的，制作一版能直接导出为软件开发所需资源的原型，不但能节省时间，还能对开发过程中遇到的问题及时修正。为此，本项目放弃使用Mockplus作为原型设计软件，转为使用具有相似功能，但支持高保真素材导出的Adobe XD进行替代。

## 安卓APP前端开发练习

本项目中安卓APP包含了多个界面，具体制作流程不一一赘述，此部分将记录一些重要功能的实现，作为开发学习笔记。成品效果详见[演示录像(密码：0000)](https://v.youku.com/v_show/id_XNDMwMjE5OTYzMg)。

### 1. 创建项目

选择SDK版本时一般根据兼容性考虑选择Android 5.0版本，但本项目根据测试机（个人手机）系统版本选择了最新的SDK版本。具体参数：
- SDK Version: 28(API 28: Android 9.0(Pie))
- Android Gradle Plugin Version: 3.4.2
- Gradle Version: 5.1.1

### 2. 透明状态栏&导航栏

Android 5.0以上常用到的透明状态栏&导航栏效果。在`style.xml`中新建一个style，并添加如下代码：
```java
<style name="AppTheme.NoActionBar">
    <item name="windowNoTitle">true</item>
    <item name="android:windowTranslucentStatus">true</item>
    <item name="android:windowTranslucentNavigation">true</item>
</style> 
```
然后在`AndroidManifest.xml`中设置Activity使用的style,这里以`StartingActivity`为例:
```java
<activity
    android:name=".StartingActivity"
    android:theme="@style/AppTheme.NoActionBar" />
```
透明化状态栏后，有时会有如下情况出现，状态栏和刘海遮挡住一部分页面内容。

<img src="/Assets/image/screenshot/status_bar_false.png" width="200" />

此时在页面layout中被遮挡的组件里添加如下代码,使组件自适应被透明化的状态栏：
```java
android:fitsSystemWindows="true"
```
<img src="/Assets/image/screenshot/status_bar_true.png" width="200" />

### 3. 过渡动画

在涉及到例如改变组件可见度的交互中，直接出现/消失会显得比较生硬，此时选择制作淡入/淡出动画。

<img src="/Assets/image/screenshot/fade_anime_1.gif" width="200" />

一个最快捷的做法——在页面layout中加入如下代码：
```java
android:animateLayoutChanges="true"
```
`animateLayoutChanges`不仅能实现淡入/淡出动画的效果，还能给位移和旋转等布局改变添加过渡效果。

<img src="/Assets/image/screenshot/fade_anime_2.gif" width="200" />

### 4. 使用SlidingPaneLayout和ListView制作导航菜单

用户账户、偏好设置等细分功能通常出现在导航菜单中。这里使用了一个符合安卓风格的右滑出现导航菜单。

<img src="/Assets/image/screenshot/fade_panel.gif" width="200" />

在layout文件中，使用`androidx.slidingpanelayout.widget.SlidingPaneLayout`作为控件主体, 然后添加子控件`ListView`。

`ListView`中单元格的格式另建一个.xml编写。在`layout`文件夹里新建`list_layout.xml`，写入图标+标签文字的单元格格式。
```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ImageView
        android:id="@+id/image"
        android:maxHeight="72dp"
        android:maxWidth="72dp"
        android:layout_width="72dp"
        android:layout_height="72dp" />
    <TextView
        android:id="@+id/title"
        android:padding="16dp"
        android:layout_gravity="center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
</LinearLayout>
```
在对应的Activity中，列出所用的图标和对应的标签文字，逐一匹配后生成ArrayList。
```java
int[] imageId = new int[]{R.drawable.icon_profile, R.drawable.icon_news, R.drawable.icon_mail, R.drawable.icon_promo, R.drawable.icon_contact,  R.drawable.icon_setting};
String[] name = new String[] {"Profile", "News", "Mailbox", "Promos", "Contact us", "Preference"};
List<Map<String, Object>> listItem = new ArrayList<>();
for (int i = 0; i < imageId.length; i++)
    {
    Map<String, Object> map = new HashMap<>();
    map.put("image", imageId[i]);
    map.put("name", name[i]);
    listItem.add(map);
    }
```
使用Adapter生成ListView。
```java
SimpleAdapter adapter = new SimpleAdapter(this, listItem, R.layout.list_layout, new String[]{"name", "image"}, new int[]{R.id.title, R.id.image});
ListView listView = super.findViewById(R.id.menuListView);
listView.setAdapter(adapter);
```
完成ListView后，制作滑动时导航菜单的淡入/淡出动画，该步骤通过改变导航菜单的透明度实现，初始值设为0，根据滑动的完成度从0过渡到1。
```java
mMenuNavi.setAlpha(0);
mSlidier.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
    @Override
    public void onPanelSlide(@NonNull View panel, float slideOffset) {
        mMenuNavi.setAlpha(slideOffset);
    }
```
### 5. 使用Animation-List制作逐帧动画

在App主界面中希望实现如下效果的动画：

<img src="/Assets/image/screenshot/running.gif" width="200" />

将动画关键帧图片（.png格式）导入`drawable`文件夹中，新建一个.xml文件，编辑为`animation-list`。
```java
<?xml version="1.0" encoding="utf-8"?>
<animation-list xmlns:android="http://schemas.android.com/apk/res/android"
    android:oneshot="false">
    <item
        android:drawable="@drawable/sprite_1"
        android:duration="45"/>
    <item
        android:drawable="@drawable/sprite_2"
        android:duration="45"/>
    <item
        android:drawable="@drawable/sprite_3"
        android:duration="45"/>
</animation-list>
```
在页面layout中新建一个`ImageView`控件, 然后在Activity的`onCreate`中将列表中的图片逐一显示在ImageView。
```java
imageRun = findViewById(R.id.spriteRunning);
imageRun.setImageResource(R.drawable.animation_1);
spriteRun=(AnimationDrawable)imageRun.getDrawable();
spriteRun.start();
```

### 6. 调用外部lib实现广告图片轮播

[调用的lib](https://github.com/youth5201314/banner)

在`build.gradle(Module:app)`中添加依赖。
```java
dependencies{
    implementation 'com.youth.banner:banner:1.4.10'
    implementation 'com.github.bumptech.glide:glide:3.8.0'   
}
```
如果需要从网络载入图片，在`AndroidManifest.xml`中添加权限。
```java
<uses-permission android:name="android.permission.INTERNET" /> 
```
新建`GlideImageLoader.java`写入Glide图片加载器。
```java
public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).into(imageView);
    }
}
```
在页面Activity中，列出轮播所用广告图片，然后在`onCreate`中加载banner。
```java
// make list for images displayed in banner ads.
Integer[] imageAd ={R.drawable.balloon, R.drawable.beach, R.drawable.camp, R.drawable.mountain};
// set up banner.
Banner banner = findViewById(R.id.banner);
banner.setImageLoader(new GlideImageLoader());
banner.setImages(Arrays.asList(imageAd));
banner.start();
```


