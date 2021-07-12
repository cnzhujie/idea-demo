package com.github.cnzhujie.ideademo.services

import com.github.cnzhujie.ideademo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
