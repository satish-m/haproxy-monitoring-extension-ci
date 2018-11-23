package EXT_HaproxyMonitoringExtensionCi

import EXT_HaproxyMonitoringExtensionCi.buildTypes.EXT_HAProxyMonitoringExtension_CleanBuild
import EXT_HaproxyMonitoringExtensionCi.buildTypes.EXT_HAProxyMonitoringExtension_IntegrationTestInLinux
import EXT_HaproxyMonitoringExtensionCi.buildTypes.EXT_HAProxyMonitoringExtension_SetupInLinux
import EXT_HaproxyMonitoringExtensionCi.buildTypes.EXT_HAProxyMonitoringExtension_StopLinux
import EXT_HaproxyMonitoringExtensionCi.vcsRoots.EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "828a8c2a-2dbd-4dbe-94dc-f709523ae848"
    id = "EXT_HaproxyMonitoringExtensionCi"
    parentId = "EXT"
    name = "Haproxy Monitoring Extension Ci"

    vcsRoot(EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension)

    buildType(EXT_HAProxyMonitoringExtension_CleanBuild)
    buildType(EXT_HAProxyMonitoringExtension_SetupInLinux)
    buildType(EXT_HAProxyMonitoringExtension_IntegrationTestInLinux)
    buildType(EXT_HAProxyMonitoringExtension_StopLinux)

    features {
        versionedSettings {
            id = "PROJECT_EXT_9"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension.id
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
