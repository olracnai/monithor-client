package custom_resources

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun olrScn(wmk: String) {
    Box(modifier = Modifier.fillMaxSize()) {

        Text(modifier = Modifier
                .align(Alignment.BottomEnd)
                .alpha(.5f),
            text = wmk
        )
    }
    println("By olracnai")
    println("https://github.com/olracnai")
}