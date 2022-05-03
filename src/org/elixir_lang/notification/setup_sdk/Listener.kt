package org.elixir_lang.notification.setup_sdk

import com.intellij.notification.Notification
import com.intellij.notification.NotificationAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.project.Project
import org.elixir_lang.module.ElixirModuleType
import org.elixir_lang.notification.setup_sdk.Provider.Companion.showFacetSettings
import org.elixir_lang.notification.setup_sdk.Provider.Companion.showModuleSettings

/**
 * Created by zyuyou on 15/7/8.
 * https://github.com/ignatov/intellij-erlang/blob/master/src/org/intellij/erlang/utils/ErlangExternalToolsNotificationListener.java
 */
class Action(private val project: Project, private val module: Module) : NotificationAction("Configure Elixir SDK") {
    override fun actionPerformed(e: AnActionEvent, notification: Notification) {
        if (ModuleType.`is`(module, ElixirModuleType.getInstance())) {
            showModuleSettings(project, module)
        } else {
            showFacetSettings(project)
        }
    }
}
