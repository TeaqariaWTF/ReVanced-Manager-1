package ru.blays.revanced.Services.NonRootService.Installer

import com.vanced.manager.repository.manager.PackageManagerResult

internal abstract class AppInstallerInterface {

    abstract suspend fun install(appVersions: List<String>?)

    abstract suspend fun installRoot(appVersions: List<String>?): PackageManagerResult<Nothing>

}