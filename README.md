# Harvest Online Banking

[简体中文](README_zh_CN.md)

A internship project aiming at developing a look-alike online banking interface.

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
