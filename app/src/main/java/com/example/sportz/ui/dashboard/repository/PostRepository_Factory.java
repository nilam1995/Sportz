package com.example.sportz.ui.dashboard.repository;

import com.example.sportz.di.ApiService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostRepository_Factory implements Factory<PostRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public PostRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public PostRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static PostRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new PostRepository_Factory(apiServiceProvider);
  }

  public static PostRepository newInstance(ApiService apiService) {
    return new PostRepository(apiService);
  }
}
