package com.github.jordangibson.episode0.services

import com.github.jordangibson.episode0.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
