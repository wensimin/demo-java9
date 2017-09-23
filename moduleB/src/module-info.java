//必须与模块文件夹同名
module moduleB {
    //引用的具体模块
    requires java.logging;
    //显式声明可被外部使用的类
    exports tech.shali.service;
}