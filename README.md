# Harvest Online Banking

[简体中文](README_zh_CN.md)

An internship project aiming at developing a look-alike online banking interface.

## Index

#### 1. Harvest Online Banking app UI mock up
1. Introduction to Mockplus
1. Fetch image resources from client APK
1. Basic loading page design
1. System mock up: Login & Account Activation workflow
#### 2. Hi-fi prototyping
1. Hi-fi prototyping: demand and methodology
1. Vector graphics with Adobe Illustrator
1. High resolution image with Adobe Photoshop
1. High fidelity Prototyping with Adobe XD
1. Export as resources for software development
#### 3. Android App development
1. Project setting
1. Translucent status bar & navigation bar
1. Fade in/out
1. Build navigation menu with SlidingPaneLayout and ListView
1. Sprite animation with Animation-list
1. Banner with external library
## Harvest Online Banking app UI mock up

### 1. Introduction to Mockplus

Mockplus is a lightweight UI portotyping software focusing on representation of design concept. Mockplus has pre-installed the majority of layout tools and interaction algorithm for main stream platforms, including Web, iOS and Android app. It features agile preview by lowering resolution of image resources, which makes the file lighter and easier to communicate within the team.

Mockplus has pre-installed a great number of template across the platform, with accesssible interaction framework. It also has over 200 interaction algorithm and 3000 icons for selection.

<img src="/Assets/image/screenshot/template.png" width="600" />

Another key feature is the auto generated interation flow diagram, which help the software developer confirm the workflow.

<img src="/Assets/image/screenshot/pageflow.png" width="600" />

The objective for Phase No.1 is to create basic interface with Mockplus, and move on to system mock up.

### 2. Fetch image resources from client APK

- Download the .apk file from Harvest Online Banking official release.
- Unzip the .apk file with WinZip and get the following Android porject structured file directory.

    <img src="/Assets/image/screenshot/apk_disassemble.png" width="500" />
  
- Go to /res, search all files of .png format, result should be the majority of image resources from the client.
- Those images will be used in the mock up.

### 3. Basic loading page design

The composition of a basic loading page includes:
- Screen-sized background image
- Button excuting "skip" command
- Timer

The interaction flow diagram is as following：

<img src="/Assets/image/screenshot/fc_loading_page.png" width="500" />

Two method forwarding to the next page: forward after timer up or after clicking the skip button.

<img src="Assets/image/screenshot/loading_timer.gif" height="300"/> <img src="Assets/image/screenshot/loading_click.gif" height="300"/> 

### 4. System mock up: Login & Account Activation workflow

The interaction between multiple interfaces are done with page link. Page link function in Mockplus includes several basic animation (e.g. push in, slide in and fade in), the duration of animation can be asigned. Page link can only be activated with clicking, other activation method require advanced interaction algorithm.

In this practice, the loading page and home page tabs were created. The main focus was on User profile page, based on this page a register and account activation workflow was produced. Following pages are examples of the whole workflow, detailed interation is recorded in this video.[mockplus_demo_url]

<img src="/Assets/image/screenshot/mockplus_demo.png" width="600" />

### Phase No.1 summary

Mockplus is a good tool for conceptual user interface design. It has great chemical reaction with UX designer who will need to respond immidiateltly to user need. 

However, there is also drawbacks, which mainly related to the compression of image resources, which forces the prototype to be low-fi and requires extra high resolution UI graphics in later stage's development. There is no significant influence in tranditional companies using waterfall project management structure, where jobs are hignly specialised. For startup companies using agile structure, expecially when UI & UX jobs are merged, unable to export development-ready image resources could become an obvious disadvantage.

## Hi-fi prototyping

### 1. Hi-fi prototyping: demand and methodology

It is important to understand that high fidelity prototype ≠ final product.

Hi-fi graphic is a set of image resources with consistant design style produced by UI designer. It is usually done after the functionality modules of the interface have been confirmed. The graphic can achieve the preview requirement of hi-fi prototype, but the details including resolution and color are still awaiting adjustment. This is because toolkits in actual app develpment may not be able to achieve the design requirement.

As an individual project, UI designer and software developer is the same. Most of the hi-fi graphic will be used in phase No.3, and the hi-fi prototype will look very identical to the final product.

Hi-fi graphic required in this porject are mainly icons for Android app that is going to be developed in phase No.3. They should be exported to sizes that are compatible with screen resolution from 480p to 4K. The majority of those icons will be produced with Adobe Illustrator, and few complicated with Adobe Photoshop.

A baseline of design style has to be decided before designing the icons. The plan suggested that the UI style "should be distinguishable against 丰收互联app". The style used in 丰收互联app is summarized as following:
- Simplified
- Flat design
- Use of similar/adjacent color
- Multi-tab homepage

Considering those facts, choices about UI style has been made for this project:
- Doodle style
- Use of contrast/complementary color
- Single scrowing homepage 

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



