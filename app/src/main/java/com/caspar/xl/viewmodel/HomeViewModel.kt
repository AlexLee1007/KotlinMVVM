package com.caspar.xl.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

/**
 *  "CasparXL" 创建 2020/5/12.
 *   界面名称以及功能: 首页功能菜单
 */
class HomeViewModel(application: Application) : AndroidViewModel(application) {
    val translate = "翻译"
    val camera = "相机"
    val room = "数据库"
    val selectFile = "文件选择器"
    val coroutines = "协程库"
    val imageLoad = "图片加载库"
    val colorSelect = "颜色选择器"
    val imageSelect = "图片选择器"

    //功能列表
    val mData: List<String> = arrayListOf(translate, camera, room, selectFile, coroutines, imageLoad, colorSelect, imageSelect)
}
