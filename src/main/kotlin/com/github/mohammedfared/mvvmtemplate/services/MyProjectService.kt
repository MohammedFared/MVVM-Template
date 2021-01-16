package com.github.mohammedfared.mvvmtemplate.services

import com.github.mohammedfared.mvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
