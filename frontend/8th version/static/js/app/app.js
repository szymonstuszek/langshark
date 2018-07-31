angular.module('app', ['ngRoute'])
.config(function($routeProvider){
    $routeProvider
    .when('/intro', {
        templateUrl: 'partials/intro.html',
        controller: null,
        controllerAs: null
    })
    .when('/dashboard', {
        templateUrl: 'partials/dashboard.html',
        controller: null,
        controllerAs: null
    })
    .when('/badges', {
        templateUrl: 'partials/badges.html',
        controller: null,
        controllerAs: null
    })
    .when('/badge', {
        templateUrl: 'partials/badge.html',
        controller: null,
        controllerAs: null
    })
    .when('/explore', {
        templateUrl: 'partials/explore.html',
        controller: null,
        controllerAs: null
    })
    .when('/mibs', {
        templateUrl: 'partials/mibs.html',
        controller: null,
        controllerAs: null
    })
     .when('/mib', {
        templateUrl: 'partials/mib.html',
        controller: null,
        controllerAs: null
    })
    .when('/report_mib', {
        templateUrl: 'partials/report_mib.html',
        controller: null,
        controllerAs: null
    })
    .when('/mib_ban', {
        templateUrl: 'partials/mib_ban.html',
        controller: null,
        controllerAs: null
    })
    .when('/report_user', {
        templateUrl: 'partials/report_user.html',
        controller: null,
        controllerAs: null
    })
    .when('/report_feedback', {
        templateUrl: 'partials/report_feedback.html',
        controller: null,
        controllerAs: null
    })
    .when('/evaluate', {
        templateUrl: 'partials/evaluate.html',
        controller: null,
        controllerAs: null
    })
    .when('/feedback', {
        templateUrl: 'partials/feedback.html',
        controller: null,
        controllerAs: null
    })
    .when('/feedbacks', {
        templateUrl: 'partials/feedbacks.html',
        controller: null,
        controllerAs: null
    })
    .when('/comments', {
        templateUrl: 'partials/comments.html',
        controller: null,
        controllerAs: null
    })
    .when('/comment', {
        templateUrl: 'partials/comment.html',
        controller: null,
        controllerAs: null
    })
    .when('/library_standard', {
        templateUrl: 'partials/library_standard.html',
        controller: null,
        controllerAs: null
    })
    .when('/library_random', {
        templateUrl: 'partials/library_random.html',
        controller: null,
        controllerAs: null
    })
     .when('/library_custom', {
        templateUrl: 'partials/library_custom.html',
        controller: null,
        controllerAs: null
    })
    .when('/topic', {
        templateUrl: 'partials/topic.html',
        controller: null,
        controllerAs: null
    })
    .when('/ranking', {
        templateUrl: 'partials/ranking.html',
        controller: null,
        controllerAs: null
    })
    .when('/how_it_works', {
        templateUrl: 'partials/how_it_works.html',
        controller: null,
        controllerAs: null
    })
    .when('/articles', {
        templateUrl: 'partials/articles.html',
        controller: null,
        controllerAs: null
    })
    .when('/article', {
        templateUrl: 'partials/article.html',
        controller: null,
        controllerAs: null
    })
    .when('/faq', {
        templateUrl: 'partials/faq.html',
        controller: null,
        controllerAs: null
    })
    .when('/contact', {
        templateUrl: 'partials/contact.html',
        controller: null,
        controllerAs: null
    })
    .when('/settings', {
        templateUrl: 'partials/settings.html',
        controller: null,
        controllerAs: null
    })
    .when('/messages', {
        templateUrl: 'partials/messages.html',
        controller: null,
        controllerAs: null
    })
    .when('/friends', {
        templateUrl: 'partials/friends.html',
        controller: null,
        controllerAs: null
    })
    .when('/profile', {
        templateUrl: 'partials/profile.html',
        controller: null,
        controllerAs: null
    })
    .when('/stats', {
        templateUrl: 'partials/stats.html',
        controller: null,
        controllerAs: null
    })
    .when('/warnings', {
        templateUrl: 'partials/warnings.html',
        controller: null,
        controllerAs: null
    })
    .when('/logout', {
        templateUrl: 'partials/logout.html',
        controller: null,
        controllerAs: null
    })
    .when('/login', {
        templateUrl: 'partials/login.html',
        controller: null,
        controllerAs: null
    })
    .when('/register', {
        templateUrl: 'partials/register.html',
        controller: null,
        controllerAs: null
    })
    .when('/setup', {
        templateUrl: 'partials/setup.html',
        controller: null,
        controllerAs: null
    })
    .when('/construction', {
        templateUrl: 'partials/construction.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_info', {
        templateUrl: 'partials/create_info.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_language', {
        templateUrl: 'partials/create_language.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_library', {
        templateUrl: 'partials/create_library.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_topic', {
        templateUrl: 'partials/create_topic.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_desc', {
        templateUrl: 'partials/create_desc.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_record', {
        templateUrl: 'partials/create_record.html',
        controller: null,
        controllerAs: null
    })
    .when('/create_done', {
        templateUrl: 'partials/create_done.html',
        controller: null,
        controllerAs: null
    })
     
    .otherwise({
        redirectTo:'/intro'
    });
    
//    Admin panel controllers?
    
})