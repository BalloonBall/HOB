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

In this practice, the loading page and home page tabs were created. The main focus was on User profile page, based on this page a register and account activation workflow was produced. Following pages are examples of the whole workflow, detailed interation is recorded in the video [here(Password:0000)](https://v.youku.com/v_show/id_XNDMwMjI2ODc0OA)

<img src="/Assets/image/screenshot/mockplus_demo.png" width="600" />

### Phase No.1 summary

Mockplus is a good tool for conceptual user interface design. It has great chemical reaction with UX designer who will need to respond immidiateltly to user need. 

However, there is also drawbacks, which mainly related to the compression of image resources, which forces the prototype to be low-fi and requires extra high resolution UI graphics in later stage's development. There is no significant influence in tranditional companies using waterfall project management structure, where jobs are hignly specialised. For startup companies using agile structure, expecially when UI & UX jobs are merged, unable to export development-ready image resources could become an obvious disadvantage.

## Hi-fi prototyping

### 1. Hi-fi prototyping: demand and methodology

It is important to understand that high fidelity prototype ≠ final product.

Hi-fi graphics is a set of image resources with consistant design style produced by UI designer. It is usually done after the functionality modules of the interface have been confirmed. The graphics can achieve the preview requirement of hi-fi prototype, but the details including resolution and color are still awaiting adjustment. This is because toolkits in actual app develpment may not be able to achieve the design requirement.

As an individual project, UI designer and software developer is the same. Most of the hi-fi graphics will be used in phase No.3, and the hi-fi prototype will look very identical to the final product.

Hi-fi graphics required in this porject are mainly icons for Android app that is going to be developed in phase No.3. They should be exported to sizes that are compatible with screen resolution from 480p to 4K. The majority of those icons will be produced with Adobe Illustrator, and few complicated with Adobe Photoshop.

A baseline of design style has to be decided before designing the icons. The plan suggested that the UI style "should be distinguishable against 丰收互联app". The style used in 丰收互联app is summarized as following:
- Simplified
- Flat design
- Use of similar/adjacent color
- Multi-tab homepage

Considering those facts, choices about UI style has been made for this project:
- Doodle style
- Use of contrast/complementary color
- Single scrowing homepage 

Color code used is here for reference:

<img src="/Assets/image/screenshot/color_theme.png" width="600" />

### 2. Vector graphics with Adobe Illustrator

In Adobe Illutrator(AI), graphics are made with bezier curves, accurate design can be made with adjustment of anchor points on the curve. This feature has made it possible to use modified Hi-fi grahics in final porduct.

An example of creating vector graphics with AI:

<img src="/Assets/image/screenshot/ai_flow.png" width="600" />

Resizing vector graphics will not affact image definition after exporting. The final resolution can be defined while exporting base on demand.

### 3. High resolution image with Adobe Photoshop

Photoshop(PS) is a widely used image processing software, in hi-fi graphics design it is used to make complicated image. In this project, icons related to third-party software were made with PS.

<img src="/Assets/image/screenshot/ps_flow.png" width="600" />

Icons are exported as high resolution .png file.

### 4. High fidelity Prototyping with Adobe XD

Adobe XD is a vectorized UI/UX prototyping software. It has adapted many design features from other adobe software. The number of interaction algorithm implanted is very limited, but can expand with plugins. Unlike Mockplus, image resources with original resolution is stored once imported, and can be exported to resources file used in software development, fitting different resolutions. Toolkits are also vectorized so that they are also developer-ready.

Using the advantage stated above, in this porject a hi-fi prototype was created in Adobe XD, after a walk-through with all UI layout and interfaces, the image resources were exported with batch processing, stepping directly into software development stage.

With suitable plugins, the efficiency of prototyping can be significantly increased. Referring to Android sticker sample relased by Google official, the design scale are kept to be consistant, avoiding incompatible layout when developing the actural software.

<img src="/Assets/image/screenshot/xd_android_sticker.png" width="600" />

The storyboard workspace is convinient to ensure the consistant design style, and make the prototype very much identical to the final product.

<img src="/Assets/image/screenshot/xd_storyboard.png" width="600" />

Phase No.2 has included the design of loading page, login page and homepage. The test trail is recorded [here(Password:0000)](https://v.youku.com/v_show/id_XNDMwMjI2NjcwMA)。

### 5. Export as resources for software development

Items in Adobe XD workspace can be exported as developer-ready resources. For Android app, resources are exported to ldpi, mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi directories and are callable in Android project.

Things worth noting:
- Rename the items as Android resource style, Unicode-8 symbol can cause bug in programme
- Set mdpi resolution as canvas size, otherwise the resolution could become mismatch after exporting.
- Many items can be made with Android layout, make sure resources exported are necessary.

### Phase No.2 summary

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



