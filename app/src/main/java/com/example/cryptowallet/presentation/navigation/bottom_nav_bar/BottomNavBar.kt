package com.example.cryptowallet.presentation.navigation.bottom_nav_bar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.cryptowallet.presentation.navigation.topLevelRoutes
import com.example.cryptowallet.ui.theme.NavBarContainerColor
import com.example.cryptowallet.ui.theme.NavBarContentColor
import com.example.cryptowallet.ui.theme.PrimaryIconTint
import com.example.cryptowallet.ui.theme.PrimaryTextColor

@Composable
fun BottomNavBar(
    navController: NavController,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier
) {
    val density = LocalDensity.current
    val bottomInsetDp =
        with(density) { NavigationBarDefaults.windowInsets.getBottom(density).toDp() }

    NavigationBar(
        containerColor = NavBarContainerColor,
        contentColor = NavBarContentColor,
        modifier = modifier
            .padding(start = 50.dp, end = 50.dp, bottom = bottomInsetDp + 12.dp)
            .height(40.dp)
            .clip(MaterialTheme.shapes.extraLarge),
        windowInsets = WindowInsets(0.dp)
    ) {
        topLevelRoutes.forEach { topLevelRoute ->
            BottomNavItem(
                selected = currentDestination?.hierarchy?.any { it.hasRoute(topLevelRoute.route::class) } == true,
                onClick = {
                    navController.navigate(topLevelRoute.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(topLevelRoute.icon),
                        contentDescription = null,
                        tint = PrimaryIconTint
                    )
                },
                label = {
                    Text(
                        text = stringResource(topLevelRoute.name),
                        style = MaterialTheme.typography.labelLarge,
                        color = PrimaryTextColor
                    )
                }
            )
        }
    }
}

