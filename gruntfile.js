'use strict';

module.exports = function (grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        
        sass: {
            dist: {
            	files: [{
                    expand: true,
                    cwd: 'src/main/resources/public/app/styles',
                    src: ['**/*.scss'],
                    dest: 'src/main/resources/public/app/styles/css/',
                    ext: '.css'
                }]
            }
        },
        
        watch: {
        	options: {
                // Start a live reload server on the default port 35729
                livereload: true,
            },
            sass: {
              files: ['**/*.scss'],
              tasks: ['sass']
            },
            html: {
                files: ['**/*.html']
              }
          }
        
    });
    
    require('load-grunt-tasks')(grunt);
    
    grunt.registerTask('default', 'sass');
};
