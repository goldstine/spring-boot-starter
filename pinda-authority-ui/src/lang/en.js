export default {
  route: {
    dashboard: 'Dashboard',
    profile: 'Profile'
  },
  navbar: {
    setting: 'Settings',
    github: 'Repository',
    logOut: 'Log Out',
    profile: 'Profile',
    theme: 'Theme',
    docs: 'Document',
    size: 'Global Size',
    deleteCache: 'DeleteCache'
  },
  login: {
    title: 'Pinda Authority',
    logIn: 'Login',
    tenant: 'tenant',
    username: 'Username',
    password: 'Password',
    code: 'Code',
    ortherLoginType: 'Orther login type',
    chooseToSignIn: 'Sign in with the following account: ',
    type: {
      up: 'Account Password',
      social: 'Third Party Account'
    }
  },
  documentation: {
    documentation: 'Documentation',
    github: 'Github Repository'
  },
  table: {
    tenant: {
      code: 'EnterpriseCode',
      name: 'EnterpriseName',
      type: 'Type',
      status: 'Status',
      duty: 'Duty',
      expirationTime: 'ExpirationTime',
      logo: 'Logo',
      describe: 'Describe',
      passwordExpire: 'PasswordExpire',
      isMultipleLogin: 'IsCanMultipleLogin',
      passwordErrorNum: 'PasswordErrorNum',
      passwordErrorLockTime: 'PasswordErrorLockTime'
    },
    user: {
      account: 'Account',
      name: 'Name',
      password: 'Password',
      orgId: 'Org',
      stationId: 'Station',
      email: 'Email',
      sex: 'Gender',
      status: 'Status',
      mobile: 'Mobile',
      avatar: 'Avatar',
      workDescribe: 'WorkDescribe',
      passwordErrorLastTime: 'PasswordErrorLastTime',
      passwordErrorNum: 'PasswordErrorNum',
      passwordExpireTime: 'PasswordExpireTime',
      lastLoginTime: 'LastLoginTime',
      createTime: 'CreateTime',
      updateTime: 'ModifyTime',
      oldPassword: 'Old Password',
      newPassword: 'New Password',
      confirmPassword: 'Confirm Again',
      social: 'Third Party Account'
    },
    role: {
      code: 'Code',
      name: 'Name',
      describe: 'Describe',
      status: 'Status',
      readonly: 'Readonly',
      createTime: 'CreateTime',
      dsType: 'DsType',
      orgList: 'Org'
    },
    menu: {
      id: 'ID',
      name: 'Name',
      describe: 'Describe',
      code: 'Permissions',
      isPublic: 'IsPublic',
      path: 'Router Uri',
      type: 'Type',
      component: 'Component',
      isEnable: 'IsEnable',
      sortValue: 'Order',
      parentId: 'ParentId',
      icon: 'Icon',
      group: 'Group'
    },
    resource: {
      code: 'Code',
      name: 'Name',
      describe: 'Describe'
    },
    org: {
      name: 'Name',
      abbreviation: 'Abbreviation',
      describe: 'Describe',
      parentId: 'ParentId',
      sortValue: 'SortValue',
      status: 'Status'
    },
    station: {
      name: 'Name',
      describe: 'Describe',
      orgId: 'Org',
      status: 'Status'
    },
    optLog: {
      requestIp: 'IP',
      type: 'type',
      userName: 'userName',
      description: 'description',
      classPath: 'classPath',
      actionMethod: 'actionMethod',
      requestUri: 'requestUri',
      httpMethod: 'httpMethod',
      params: 'params',
      result: 'result',
      exDesc: 'exDesc',
      consumingTime: 'consumingTime',
      startTime: 'startTime',
      finishTime: 'finishTime',
      ua: 'ua'
    },
    loginLog: {
      userName: 'userName',
      account: 'account',
      requestIp: 'IP',
      description: 'description',
      loginDate: 'loginDate',
      ua: 'ua',
      browser: 'browser',
      browserVersion: 'browserVersion',
      operatingSystem: 'operatingSystem',
      location: 'location'
    },
    attachment: {
      bizId: 'bizId',
      bizType: 'bizType',
      dataType: 'dataType',
      submittedFileName: 'submittedFileName',
      group: 'group',
      path: 'path',
      relativePath: 'relativePath',
      url: 'url',
      fileMd5: 'fileMd5',
      contextType: 'contextType',
      filename: 'filename',
      ext: 'ext',
      size: 'size',
      orgId: 'orgId',
      icon: 'icon'
    },
    smsTemplate: {
      providerType: 'providerType',
      appId: 'appId',
      appSecret: 'appSecret',
      url: 'url',
      customCode: 'customCode',
      name: 'name',
      content: 'content',
      templateParams: 'templateParams',
      templateCode: 'templateCode',
      signName: 'signName',
      templateDescribe: 'templateDescribe'
    },
    smsTask: {
      templateId: 'templateId',
      status: 'status',
      sourceType: 'sourceType',
      receiver: 'receiver',
      topic: 'topic',
      templateParams: 'templateParams',
      sendTime: 'sendTime',
      content: 'content',
      draft: 'isDraft'
    },
    smsSendStatus: {
      taskId: 'task',
      sendStatus: 'sendStatus',
      receiver: 'receiver',
      bizId: 'bizId',
      ext: 'ext',
      code: 'code',
      message: 'message',
      fee: 'fee'
    },
    msgs: {
      bizType: 'bizType',
      bizId: 'bizId',
      msgsCenterType: 'msgsCenterType',
      title: 'title',
      content: 'content',
      author: 'author',
      handlerUrl: 'handlerUrl',
      handlerParams: 'handlerParams',
      isSingleHandle: 'isSingleHandle',
      isDelete: 'isDelete',
      isRead: 'isRead',
      readTime: 'readTime'
    },
    systemApi: {
      code: "code",
      name: "name",
      describe: "describe",
      requestMethod: "requestMethod",
      contentType: "contentType",
      serviceId: "serviceId",
      path: "path",
      status: "status",
      isPersist: "isPersist",
      isAuth: "isAuth",
      isOpen: "isOpen",
      className: "className",
      methodName: "methodName"
    },
    application: {
      appKey: "appKey",
      appSecret: "appSecret",
      website: "website",
      name: "name",
      icon: "icon",
      appType: "appType",
      describe: "describe",
      status: "status"
    },
    dictionary: {
      code: "code",
      name: "name",
      describe: "describe",
      status: "status"
    },
    dictionaryItem: {
      dictionaryId: "dictionaryId",
      dictionaryCode: "dictionaryCode",
      code: "code",
      name: "name",
      describe: "describe",
      status: "status",
      sortValue: "sortValue"
    },
    gen: {
      config: {
        author: 'Author',
        basePackage: 'Base Package',
        entityPackage: 'Entity Package',
        mapperPackage: 'Mapper Package',
        mapperXmlPackage: 'Mapper Xml Package',
        servicePackage: 'Service Package',
        serviceImplPackage: 'ServiceImpl Package',
        controllerPackage: 'Controller Package',
        isTrim: 'Trim Prefix',
        trimValue: 'Trim Value'
      },
      generate: {
        tableName: 'TableName',
        remark: 'Remark',
        dataRows: 'DataRows',
        createTime: 'CreateTime',
        updateTime: 'UpdateTime'
      }
    },
    eximport: {
      field1: 'Field 1',
      field2: 'Field 2',
      field3: 'Field 3',
      createTime: 'Import Time'
    },
    status: 'Status',
    refresh: 'Refresh',
    operation: 'Operation',
    search: 'Search',
    reset: 'Reset',
    more: 'More',
    add: 'Add',
    export: 'Export',
    import: 'Import',
    upload: 'Upload',
    download: 'Download',
    templateDownload: 'Template Download',
    delete: 'Delete',
    resetPassword: 'RestPassword',
    openInNewPage: 'New Page',
    createTime: 'createTime',
    updateTime: 'updateTime'
  },
  tagsView: {
    refresh: 'Refresh',
    close: 'Close',
    closeOthers: 'Close Others',
    closeAll: 'Close All'
  },
  settings: {
    title: 'Page style setting',
    theme: 'Theme Color',
    tagsView: 'Open Tags-View',
    fixedHeader: 'Fixed Header',
    sidebarLogo: 'Sidebar Logo'
  },
  system: {
    title: 'Pinda Authority System'
  },
  tips: {
    systemError: 'System maintenance, please try again~',
    usernameShouldNotBeEmpty: 'Username can not be empty',
    passwordShouldNotBeEmpty: 'Password can not be empty',
    switchLanguageSuccess: 'Switch language successfully',
    loginSuccess: 'Login successful',
    loginFail: 'Login failed',
    defaultPassword: 'The user\'s default password is 123456',
    getDataFail: 'Failed to get data',
    createSuccess: 'Create successfully',
    updateSuccess: 'Update successfully',
    deleteSuccess: 'Delete successfully',
    noDataSelected: 'No data selected yet',
    confirmDelete: 'The selected data will be permanently deleted, continue?',
    confirmDeleteCache: 'Whether to clear the user permission cache immediately?',
    containCurrentUser: 'The operation has been canceled because it contains the currently logged in user',
    neverLogin: 'Never logged in to the pinda system',
    nothing: 'Nothing',
    topId: 'A value of 0 indicates a top-level node',
    choose: 'Select: ',
    chooseNothing: 'No icons have been selected yet',
    onlyChooseOne: 'Only one node can be selected as the parent node',
    noNodeSelected: 'Please select a node first',
    confirmDeleteNode: 'The selected node and its child nodes will be permanently deleted. Continue?',
    iframeGrant: 'Userame: pinda Password: pinda',
    notEqual: 'Inconsistent values entered twice',
    oldPasswordIncorrect: 'Old password incorrect',
    uploadSuccess: 'Upload Successfully',
    uploadFailed: 'Upload failed',
    onlySupportXlsx: 'Only supports Xlsx type files',
    updating: 'Updating',
    updateFailed: 'Update failed',
    noPermission: 'No permission',
    confirmRestPassword: 'Make sure to reset the selected user password?',
    resetPasswordSuccess: 'The selected user password reset has been reset to 123456',
    getCodeImageFailed: 'Failed to get image verification code',
    tooManyRequest: 'Getting the authentication code is too frequent. Please try again in 1 minute',
    clientOriginSecret: 'The original password of the client is: '
  },
  rules: {
    require: 'Can\'t be empty',
    range0to255: '0 to 255 characters in length',
    range2to10: '2 to 10 characters in length',
    range3to10: '3 to 10 characters in length',
    range3to20: '3 to 20 characters in length',
    range4to10: '4 to 10 characters in length',
    range6to20: '6 to 20 characters in length',
    email: 'Email is invalid',
    mobile: 'Phone number is invalid',
    usernameExist: 'The username already exists',
    clientIdExist: 'The clientId already exists',
    roleNameExist: 'The role name already exists',
    noMoreThan10: 'Can\'t exceed 10 characters in length',
    noMoreThan11: 'Can\'t exceed 11 characters in length',
    noMoreThan20: 'Can\'t exceed 20 characters in length',
    noMoreThan50: 'Can\'t exceed 50 characters in length',
    noMoreThan100: 'Can\'t exceed 100 characters in length',
    invalidInteger: 'Please enter an integer greater than zero',
    invalidURL: 'URL is invalid'
  },
  common: {
    system: 'Microservice SaaS System',
    desc: {
      a: 'Based on Spring Boot 2.1.2 & Spring Cloud Greenwich.RELEASE',
      b: 'Use Jwt Unified Authentication',
      c: 'Enterprise design and configuration, deny demo project',
      d: 'Front-end separation architecture for increased efficiency',
      e: 'Integrate multiple monitoring to escort microservices',
      f: 'Provide detailed documentation and teach you how to build it'
    },
    view: 'Detail',
    tips: 'Tips',
    clear: 'Clear',
    confirm: 'Confirm',
    cancel: 'Cancel',
    add: 'Create',
    edit: 'Modify',
    upload: 'Upload',
    username: 'User Name',
    dept: 'Department',
    createTime: 'Create Time',
    yes: 'Yes',
    no: 'No',
    sex: {
      male: 'Male',
      female: 'Female',
      secret: 'Secret'
    },
    status: {
      valid: 'Valid',
      invalid: 'Invalid'
    },
    menu: {
      menu: 'Menu',
      button: 'Button'
    },
    tab: {
      common: 'Common',
      directivity: 'Directivity',
      solid: 'Solid',
      food: 'Food'
    },
    aboutMe: 'About Me',
    changeAvatar: 'Change',
    lastLoginTime: 'Last login time',
    goodMorning: 'Good morning',
    goodAfternoon: 'Good afternoon',
    goodEvening: 'Good evening',
    randomMessage: {
      0: '帮我帮我帮我帮我帮我帮我帮我',
      1: 'Have a coffee break☕',
      2: 'Do you want to play LOL with your friends?',
      3: 'How many bugs🐞 did you write today?',
      4: 'Have you chatted in the group today?',
      5: 'What delicious food did you eat today?',
      6: 'Have you smiled today?😊',
      7: 'Have you solved the problem for others today?',
      8: 'What are you going to eat?',
      9: 'Do you want to watch movies on weekends?'
    },
    docDetails: 'Learn more',
    allProject: 'All Projects',
    noDept: 'No department',
    noRole: 'No role',
    noEmail: 'No Email',
    noMobile: 'No Mobile',
    noWorkDescribe: `This guy's lazy.He didn't leave anything.`,
    firstLogin: 'First login',
    todayIp: 'Today IP',
    todayVisit: 'Today visits',
    TotalVisit: 'Total visits',
    you: 'You',
    total: 'Total',
    visitTitle: 'Nearly ten days of system access records',
    timeline: 'Timeline',
    account: 'Account',
    password: 'Password',
    importResult: 'Import Result',
    hthz: 'Hou Tian Hanzi',
    al: 'Ali Style',
    lm: 'Lian Meng',
    ctc: 'Click to select',
    pleaseInputUrl: 'Please enter a URL',
    bind: 'Bind',
    unbind: 'Unbind',
    confirmUnbind: 'Make sure to unbind the third-party account?',
    unbindSuccess: 'Unbind successfully',
    bindSuccess: 'Bind successfully',
    bindLogin: 'Bind & Login',
    signLogin: 'Sign & Login',
    current: 'Current ',
    socialAccount: ' account ',
    socialTips: ' haven\'t bound any system accounts yet, you can bind system accounts or register a new account and bind.'
  }
}
