package EXT_HAProxyMonitoringExtension

import EXT_HAProxyMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_CleanBuild
import EXT_HAProxyMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_IntegrationTestInLinux
import EXT_HAProxyMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_SetupInLinux
import EXT_HAProxyMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_StopLinux
import EXT_HAProxyMonitoringExtension.vcsRoots.*
import EXT_HAProxyMonitoringExtension.vcsRoots.EXT_HAProxyMonitoringExtension_HAProxy
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a5687f14-22ad-4db8-8bbb-7eb1861084b0"
    id = "EXT_HAProxyMonitoringExtension"
    parentId = "EXT"
    name = "HAProxyMonitoringExtension"

    vcsRoot(EXT_HAProxyMonitoringExtension_HAProxy)

    buildType(EXT_HAProxyMonitoringExtension_CleanBuild)
    buildType(EXT_HAProxyMonitoringExtension_SetupInLinux)
    buildType(EXT_HAProxyMonitoringExtension_IntegrationTestInLinux)
    buildType(EXT_HAProxyMonitoringExtension_StopLinux)

    features {
        versionedSettings {
            id = "PROJECT_EXT_10"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = EXT_HAProxyMonitoringExtension_HAProxy.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    buildTypesOrder = arrayListOf(
            EXT_HAProxyMonitoringExtension_CleanBuild,
            EXT_HAProxyMonitoringExtension_SetupInLinux,
            EXT_HAProxyMonitoringExtension_IntegrationTestInLinux,
            EXT_HAProxyMonitoringExtension_StopLinux
    )

})
