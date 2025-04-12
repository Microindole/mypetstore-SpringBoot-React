# Mypetstore-SpringBoot_React

### 软件开发架构平台小组实验

#### 简介：

​	这是一个前后端分离的项目，后端使用SpringBoot进行开发，前端使用React+Vite开发

##### 结构

###### mypetstore-api

​		后端部分

###### mypetstore-front

​		前端部分

###### mypetstore-api.pdf  mypetstore-api.md

​		后端接口文档      .md是源文件

#### mypetstore-api

​	该项目基于 Spring Boot 和 MyBatis Plus，包含前端静态资源（HTML、CSS、JS）和后端 Java 代码，支持 RESTful API 和管理功能。

### `main/` 目录

- **`java/`**：包含 Java 源代码。

  - `org.csu.petstore`

    ：项目的主包。

    - **`MyPetStoreSsmDevApplication.java`**：Spring Boot 应用程序的入口类。
    - **`controller/`**：控制器层，处理 HTTP 请求。
    - **`service/`**：服务层，包含业务逻辑。
    - **`entity/`**：实体类，映射数据库表。
    - **`persistence/`**：持久层接口，使用 MyBatis Mapper。
    - **`vo/`**：值对象，用于封装数据。

#### mypetstore-front

##### 说明

1. **[App.jsx](vscode-file://vscode-app/d:/Microsoft VS Code/Microsoft VS Code/resources/app/out/vs/code/electron-sandbox/workbench/workbench.html) 和 [main.jsx](vscode-file://vscode-app/d:/Microsoft VS Code/Microsoft VS Code/resources/app/out/vs/code/electron-sandbox/workbench/workbench.html)**：负责应用的初始化和路由配置。
2. **`context/`**：存放全局状态管理的上下文文件，例如用户信息。
3. **`css/`**：存放项目的样式文件，分为全局样式和页面/组件样式。
4. **`js/`**：存放功能性 JavaScript 文件，例如表单验证、购物车更新等。
5. **`pages/`**：存放页面组件，按功能模块划分子文件夹。
6. **`utils/`**：存放工具类文件，例如 Axios 配置。
7. **`assets/`**：存放静态资源，例如图片、SVG 文件等。



以下是该项目的结构说明：

src

├── App.jsx        # 应用的主入口，定义了路由结构

├── main.jsx        # React 应用的渲染入口，挂载到 DOM

├── assets/        # 静态资源文件夹

│  └── react.svg     # 示例静态资源

├── context/        # 全局上下文管理

│  └── UserContext.jsx  # 用户上下文，用于管理用户状态

├── css/          # 样式文件夹

│  ├── register.css    # 注册页面的样式

│  ├── login.css     # 登录页面的样式

│  ├── mypetstore.css   # 全局样式

│  ├── top-bottom.css   # 顶部和底部组件样式

│  ├── userinfo.css    # 用户信息页面样式

│  ├── useredit.css    # 用户编辑页面样式

│  ├── best/       # 第三方或特定功能样式

│  │  ├── animate.css  # 动画效果样式

│  │  ├── bootstrap.min.css # Bootstrap 样式

│  │  ├── flaticon.css  # 图标样式

│  │  └── ...      # 其他样式文件

├── js/          # JavaScript 功能脚本

│  ├── NameIsExist.js   # 检查用户名是否存在

│  ├── Order.js      # 订单相关功能

│  ├── productAuto.js   # 产品自动补全功能

│  ├── RepeatedPassword.js # 密码重复验证

│  ├── showCategory.js  # 分类展示功能

│  ├── Update-Cart.js   # 更新购物车功能

│  └── updateCart.js   # 更新购物车功能（可能是重复文件）

├── pages/         # 页面组件

│  ├── account/      # 账户相关页面

│  │  ├── register.jsx  # 注册页面

│  │  ├── login.jsx   # 登录页面

│  │  └── ...      # 其他账户相关页面

│  ├── Catalog/      # 商品目录相关页面

│  ├── common/      # 公共组件

│  │  ├── top.jsx    # 顶部导航栏

│  │  ├── bottom.jsx   # 底部栏

│  │  └── ...      # 其他公共组件

├── router/        # 路由相关文件

├── store/         # 状态管理相关文件

├── utils/         # 工具函数

│  └── axiosInstance.js  # Axios 实例配置