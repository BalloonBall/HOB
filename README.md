# Harvest Online Banking

[简体中文](README_zh_CN.md)

A internship project aiming at developing a look-alike online banking interface.

## Index

#### 1. Harvest Online Banking app UI mock up
    1.1. Introduction to Mockplus
    1.2. Fetch image resources from client APK
    1.3. Basic loading page design
    1.4. System mock up: Login & Account Activation workflow
#### 2. Hi-fi prototyping
    2.1. Hi-fi prototyping: demand and methodology
    2.2. Vector graphics with Adobe Illustrator
    2.3. High resolution image with Adobe Photoshop
    2.4. High fidelity Prototyping with Adobe XD
    2.5. Export as resources for software development
#### 3. Android App development
        
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

## 高保真图制作练习

### 1. 高保真图的制作流程以及供给不同应用的需求

首先要确定的一个概念：高保真图≠最终成品图。

高保真图是在功能板块确定的情况下，由UI设计师绘制的风格统一的图标图片资源。能够实现高保真原型需要达到的效果，但细节（尺寸，颜色等）还未深入细化。由于开发工程的控件素材不一定能完全满足高保真设计的需求，最终成品需要在开发过程中进行调整。

因为本项目是个人项目，UI设计和产品开发由同一人完成，所以在第二阶段的高保真图将被大部分应用到第三阶段，高保真原型也将无限接近成品。

本项目所需的高保真图主要为适配Android手机App的控件图标，为了适配从低（480p）到高（4K)分辨率的手机屏幕，大多数的控件图标将使用Adobe Illustrator绘制，其余复杂图形将使用Adobe Photoshop绘制。

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

第二阶段的设计内容包括了载入界面，登录界面和主页等页面，在Adobe XD中的预览效果如下所示：
[xd_demo_url]

