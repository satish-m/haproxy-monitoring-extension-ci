package EXT_HAProxyMonitoringExtension

import EXT_ApacheMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_CleanBuild
import EXT_ApacheMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_IntegrationTestInLinux
import EXT_ApacheMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_SetupInLinux
import EXT_ApacheMonitoringExtension.buildTypes.EXT_HAProxyMonitoringExtension_StopLinux
import EXT_HAProxyMonitoringExtension.vcsRoots.EXT_HAProxyMonitoringExtension
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "A4B05F16-F6F5-430B-8C02-B9E529FE6D04"
    id = "EXT_HAProxyMonitoringExtension"
    parentId = "EXT"
    name = "HAProxyMonitoringExtension"

    vcsRoot(EXT_HAProxyMonitoringExtension)


    buildType(EXT_HAProxyMonitoringExtension_CleanBuild)
    buildType(EXT_HAProxyMonitoringExtension_SetupInLinux)
    buildType(EXT_HAProxyMonitoringExtension_IntegrationTestInLinux)
    buildType(EXT_HAProxyMonitoringExtension_StopLinux)

    features {
        versionedSettings {
            id = "PROJECT_EXT_9"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = EXT_HAProxyMonitoringExtension.id
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
