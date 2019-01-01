package controllers

import io.kleisli.Test
import play.api.mvc.{Action, AnyContent, InjectedController}

class AppController extends InjectedController {
  def test: Action[AnyContent] = Action { _ =>
    Ok(s"Test times two: ${new Test(3).timeTwo}")
  }
}
