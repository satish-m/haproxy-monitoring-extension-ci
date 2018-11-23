package EXT_HaproxyMonitoringExtensionCi

import EXT_HaproxyMonitoringExtensionCi.buildTypes.*
import EXT_HaproxyMonitoringExtensionCi.vcsRoots.*
import EXT_HaproxyMonitoringExtensionCi.vcsRoots.EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "828a8c2a-2dbd-4dbe-94dc-f709523ae848"
    id = "EXT_HaproxyMonitoringExtensionCi"
    parentId = "EXT"
    name = "Haproxy Monitoring Extension Ci"

    vcsRoot(EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension)

    buildType(EXT_HaproxyMonitoringExtensionCi_Build)

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
})
