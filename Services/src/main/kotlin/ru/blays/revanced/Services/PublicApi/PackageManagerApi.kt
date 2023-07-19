package ru.blays.revanced.Services.PublicApi

import kotlinx.coroutines.Deferred
import ru.blays.revanced.Services.NonRootService.Interfaces.PackageManagerInterface
import ru.blays.revanced.Services.NonRootService.Interfaces.PackageManagerResult
import java.io.File

interface PackageManagerApi {

    val packageManagerInterface: PackageManagerInterface

    fun installApk(file: File, installerType: Int): Deferred<PackageManagerResult<Nothing>>

    fun installSplitApks(files: List<File>, installerType: Int)

    fun uninstall(packageName: String)

    fun launchApp(packageName: String)

    fun getVersionName(packageName: String): Deferred<PackageManagerResult<String>>

    fun getVersionCode(packageName: String): Deferred<PackageManagerResult<Int>>

}