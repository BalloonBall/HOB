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
