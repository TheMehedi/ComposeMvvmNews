/**
 * Created by Mohammad Mehedi Hasan on 12,September,2024
 * Email: themehedi.pro@gmail.com
 */

/*This centered dependency management can help one or multiple developer to easily manage their dependencies. So that
there would cause no conflict.*/
object Dependencies {

  val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
  val appCompat by lazy { "androidx.appCompat:appCompat:${Versions.appCompat}" }
  val material by lazy { "com.google.android.material:material:${Versions.material}" }
  val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
  val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
  val composeBom by lazy { "androidx.compose:compose-bom:${Versions.compose}" }
  val composeUi by lazy { "androidx.compose.ui:ui:1.7.1" }
  val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics:" }
  val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:" }
  val composeMaterial3 by lazy { "androidx.compose.material3:material3:1.3.0" }
  val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }
  val composeTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.navigationCompose}" }
  val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
  val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
  val lifecycleViewModelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelCompose}" }
}